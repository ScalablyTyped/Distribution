package typings.pgPromise.mod

import typings.pgPromise.anon.CapSQL
import typings.pgPromise.anon.RawType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Query formatting namespace;
// API: http://vitaly-t.github.io/pg-promise/formatting.html
@js.native
trait IFormatting extends StObject {
  
  def alias(name: String): String = js.native
  def alias(name: js.Function0[String]): String = js.native
  
  def array(arr: js.Array[Any]): String = js.native
  def array(arr: js.Array[Any], options: CapSQL): String = js.native
  def array(arr: js.Function0[js.Array[Any]]): String = js.native
  def array(arr: js.Function0[js.Array[Any]], options: CapSQL): String = js.native
  
  def bool(value: js.Function0[Any]): String = js.native
  def bool(value: Any): String = js.native
  
  def buffer(obj: js.Function0[js.Object]): String = js.native
  def buffer(obj: js.Function0[js.Object], raw: Boolean): String = js.native
  def buffer(obj: js.Object): String = js.native
  def buffer(obj: js.Object, raw: Boolean): String = js.native
  
  def csv(values: js.Function0[Any]): String = js.native
  def csv(values: Any): String = js.native
  
  var ctf: RawType = js.native
  
  def date(d: js.Date): String = js.native
  def date(d: js.Date, raw: Boolean): String = js.native
  def date(d: js.Function0[js.Date]): String = js.native
  def date(d: js.Function0[js.Date], raw: Boolean): String = js.native
  
  def format(query: String): String = js.native
  def format(query: String, values: Any): String = js.native
  def format(query: String, values: Any, options: IFormattingOptions): String = js.native
  def format(query: String, values: Unit, options: IFormattingOptions): String = js.native
  def format(query: ICTFObject): String = js.native
  def format(query: ICTFObject, values: Any): String = js.native
  def format(query: ICTFObject, values: Any, options: IFormattingOptions): String = js.native
  def format(query: ICTFObject, values: Unit, options: IFormattingOptions): String = js.native
  def format(query: QueryFile): String = js.native
  def format(query: QueryFile, values: Any): String = js.native
  def format(query: QueryFile, values: Any, options: IFormattingOptions): String = js.native
  def format(query: QueryFile, values: Unit, options: IFormattingOptions): String = js.native
  
  def func(func: js.Function1[/* cc */ Any, Any]): String = js.native
  def func(func: js.Function1[/* cc */ Any, Any], raw: Boolean): String = js.native
  def func(func: js.Function1[/* cc */ Any, Any], raw: Boolean, cc: Any): String = js.native
  def func(func: js.Function1[/* cc */ Any, Any], raw: Unit, cc: Any): String = js.native
  
  def json(data: js.Function0[Any]): String = js.native
  def json(data: js.Function0[Any], raw: Boolean): String = js.native
  def json(data: Any): String = js.native
  def json(data: Any, raw: Boolean): String = js.native
  
  def name(name: js.Function0[Any]): String = js.native
  def name(name: Any): String = js.native
  
  def number(value: js.BigInt): String = js.native
  def number(value: js.Function0[Double | js.BigInt]): String = js.native
  def number(value: Double): String = js.native
  
  def text(value: js.Function0[Any]): String = js.native
  def text(value: js.Function0[Any], raw: Boolean): String = js.native
  def text(value: Any): String = js.native
  def text(value: Any, raw: Boolean): String = js.native
  
  def value(value: js.Function0[Any]): String = js.native
  def value(value: Any): String = js.native
}

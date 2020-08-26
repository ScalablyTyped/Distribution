package typings.pgPromise.mod

import typings.pgPromise.anon.CapSQL
import typings.pgPromise.anon.RawType
import typings.std.BigInt
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query formatting namespace;
// API: http://vitaly-t.github.io/pg-promise/formatting.html
@js.native
trait IFormatting extends js.Object {
  var ctf: RawType = js.native
  def alias(name: String): String = js.native
  def alias(name: js.Function0[String]): String = js.native
  def array(arr: js.Array[_]): String = js.native
  def array(arr: js.Array[_], options: CapSQL): String = js.native
  def array(arr: js.Function0[js.Array[_]]): String = js.native
  def array(arr: js.Function0[js.Array[_]], options: CapSQL): String = js.native
  def bool(value: js.Any): String = js.native
  def bool(value: js.Function0[_]): String = js.native
  def buffer(obj: js.Function0[js.Object]): String = js.native
  def buffer(obj: js.Function0[js.Object], raw: Boolean): String = js.native
  def buffer(obj: js.Object): String = js.native
  def buffer(obj: js.Object, raw: Boolean): String = js.native
  def csv(values: js.Any): String = js.native
  def csv(values: js.Function0[_]): String = js.native
  def date(d: js.Function0[Date]): String = js.native
  def date(d: js.Function0[Date], raw: Boolean): String = js.native
  def date(d: Date): String = js.native
  def date(d: Date, raw: Boolean): String = js.native
  def format(query: String): String = js.native
  def format(query: String, values: js.UndefOr[scala.Nothing], options: IFormattingOptions): String = js.native
  def format(query: String, values: js.Any): String = js.native
  def format(query: String, values: js.Any, options: IFormattingOptions): String = js.native
  def format(query: ICTFObject): String = js.native
  def format(query: ICTFObject, values: js.UndefOr[scala.Nothing], options: IFormattingOptions): String = js.native
  def format(query: ICTFObject, values: js.Any): String = js.native
  def format(query: ICTFObject, values: js.Any, options: IFormattingOptions): String = js.native
  def format(query: QueryFile): String = js.native
  def format(query: QueryFile, values: js.UndefOr[scala.Nothing], options: IFormattingOptions): String = js.native
  def format(query: QueryFile, values: js.Any): String = js.native
  def format(query: QueryFile, values: js.Any, options: IFormattingOptions): String = js.native
  def func(func: js.Function1[/* cc */ js.Any, _]): String = js.native
  def func(func: js.Function1[/* cc */ js.Any, _], raw: js.UndefOr[scala.Nothing], cc: js.Any): String = js.native
  def func(func: js.Function1[/* cc */ js.Any, _], raw: Boolean): String = js.native
  def func(func: js.Function1[/* cc */ js.Any, _], raw: Boolean, cc: js.Any): String = js.native
  def json(data: js.Any): String = js.native
  def json(data: js.Any, raw: Boolean): String = js.native
  def json(data: js.Function0[_]): String = js.native
  def json(data: js.Function0[_], raw: Boolean): String = js.native
  def name(name: js.Any): String = js.native
  def name(name: js.Function0[_]): String = js.native
  def number(value: js.Function0[Double | BigInt]): String = js.native
  def number(value: Double): String = js.native
  def number(value: BigInt): String = js.native
  def text(value: js.Any): String = js.native
  def text(value: js.Any, raw: Boolean): String = js.native
  def text(value: js.Function0[_]): String = js.native
  def text(value: js.Function0[_], raw: Boolean): String = js.native
  def value(value: js.Any): String = js.native
  def value(value: js.Function0[_]): String = js.native
}


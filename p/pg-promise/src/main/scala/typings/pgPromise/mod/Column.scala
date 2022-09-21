package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// helpers.Column class;
// API: http://vitaly-t.github.io/pg-promise/helpers.Column.html
@JSImport("pg-promise", "Column")
@js.native
open class Column[T] protected ()
  extends StObject
     with _QueryColumns[T] {
  def this(col: String) = this()
  def this(col: IColumnConfig[T]) = this()
  
  val cast: String = js.native
  
  val castText: String = js.native
  
  val cnd: Boolean = js.native
  
  val `def`: Any = js.native
  
  val escapedName: String = js.native
  
  def init(col: IColumnDescriptor[T]): Any = js.native
  
  val mod: FormattingFilter = js.native
  
  // these are all read-only:
  val name: String = js.native
  
  val prop: String = js.native
  
  def skip(col: IColumnDescriptor[T]): Boolean = js.native
  
  def toString(level: Double): String = js.native
  
  val variable: String = js.native
}

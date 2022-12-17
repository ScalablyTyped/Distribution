package typings.pkijs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "ParameterError")
@js.native
open class ParameterError protected ()
  extends StObject
     with Error {
  def this(field: String) = this()
  def this(field: String, target: String) = this()
  def this(field: String, target: String, message: String) = this()
  def this(field: String, target: Null, message: String) = this()
  def this(field: String, target: Unit, message: String) = this()
  
  var field: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var target: js.UndefOr[String] = js.native
}
object ParameterError {
  
  @JSImport("pkijs", "ParameterError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "ParameterError.NAME")
  @js.native
  val NAME: /* "ParameterError" */ String = js.native
  
  /* static member */
  inline def assert(params: Any, fields: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(scala.List(params.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  /* static member */
  inline def assert(target: String, params: Any, fields: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")((scala.List(target.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  /* static member */
  inline def assertEmpty(value: Any, name: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmpty")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  inline def assertEmpty(value: Any, name: String, target: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertEmpty")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
}

package typings.pkijs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "AsnError")
@js.native
open class AsnError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
object AsnError {
  
  @JSImport("pkijs", "AsnError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def assert(asn: AsnFromBerResult, target: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(asn.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def assertSchema(asn1: AsnCompareSchemaResult, target: String): /* asserts asn1 is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(pkijs), TsIdentSimple(anon), TsIdentSimple(Result))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSchema")(asn1.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* asserts asn1 is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(pkijs), TsIdentSimple(anon), TsIdentSimple(Result))),IArray())*/ Boolean]
}

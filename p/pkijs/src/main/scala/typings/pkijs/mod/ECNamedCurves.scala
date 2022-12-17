package typings.pkijs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "ECNamedCurves")
@js.native
open class ECNamedCurves () extends StObject
object ECNamedCurves {
  
  @JSImport("pkijs", "ECNamedCurves")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an ECC named curve object
    * @param nameOrId Name or identifier of the named curve
    * @returns
    */
  /* static member */
  inline def find(nameOrId: String): ECNamedCurve | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(nameOrId.asInstanceOf[js.Any]).asInstanceOf[ECNamedCurve | Null]
  
  /* static member */
  @JSImport("pkijs", "ECNamedCurves.namedCurves")
  @js.native
  val namedCurves: Record[String, ECNamedCurve] = js.native
  
  /**
    * Registers an ECC named curve
    * @param name The name o the curve
    * @param id The curve ASN.1 object identifier
    * @param size The coordinate length in bytes
    */
  /* static member */
  inline def register(name: String, id: String, size: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

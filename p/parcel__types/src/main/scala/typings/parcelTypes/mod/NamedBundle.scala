package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedBundle
  extends StObject
     with Bundle {
  
  /** A version of the bundle's name with hash references removed for display. */
  val displayName: String = js.native
  
  /**
    * The bundle's name. This is a file path relative to the bundle's target directory.
    * The bundle name may include a hash reference, but not the final content hash.
    */
  val name: String = js.native
  
  /** A shortened version of the bundle id that is used to refer to the bundle at runtime. */
  val publicId: String = js.native
}

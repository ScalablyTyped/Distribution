package typings.mendixmodelsdk.srcGenProjectsMod.projects

import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocument
  extends StObject
     with IModuleDocument
     with IByNameReferrable {
  
  /**
    * In version 9.10.0: added public
    */
  val documentation: String = js.native
  
  /**
    * In version 9.11.0: added public
    */
  val excluded: Boolean = js.native
  
  val name: String = js.native
}

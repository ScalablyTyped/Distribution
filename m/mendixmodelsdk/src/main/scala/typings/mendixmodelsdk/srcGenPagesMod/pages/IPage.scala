package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/page relevant section in reference guide}
  */
@js.native
trait IPage
  extends StObject
     with IFormBase {
  
  /**
    * In version 7.23.0: added public
    */
  val allowedRoles: IList[IModuleRole] = js.native
  
  val allowedRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  val layoutCall: ILayoutCall = js.native
  
  /**
    * In version 9.4.0: introduced
    */
  val parameters: IList[IPageParameter] = js.native
}

package typings.mendixmodelsdk.pagesMod.pages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/page-templates relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
@js.native
trait IPageTemplate extends ITemplateFormBase {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  val layoutCall: ILayoutCall = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.13.0: introduced
    */
  val templateType: ITemplateType = js.native
  
  /**
    * In version 8.13.0: deleted
    * In version 7.17.0: added public
    */
  val `type`: PageTemplateType = js.native
}

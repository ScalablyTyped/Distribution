package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/snippet relevant section in reference guide}
  */
@js.native
trait ISnippet extends IFormBase {
  
  val entity: IEntity | Null = js.native
  
  val entityQualifiedName: String | Null = js.native
  
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  val `type`: SnippetType = js.native
}

package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/snippet relevant section in reference guide}
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


package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-app-services relevant section in reference guide}
  */
@js.native
trait IConsumedAppService extends IDocument {
  
  val actions: IList[IAppServiceAction] = js.native
}

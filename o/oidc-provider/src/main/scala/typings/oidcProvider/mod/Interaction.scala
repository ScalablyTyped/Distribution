package typings.oidcProvider.mod

import typings.oidcProvider.anon.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interaction
  extends StObject
     with BaseModel {
  
  var deviceCode: js.UndefOr[String] = js.native
  
  @JSName("exp")
  var exp_Interaction: Double = js.native
  
  var grantId: js.UndefOr[String] = js.native
  
  @JSName("iat")
  var iat_Interaction: Double = js.native
  
  @JSName("kind")
  val kind_Interaction: typings.oidcProvider.oidcProviderStrings.Interaction = js.native
  
  var lastSubmission: js.UndefOr[InteractionResults] = js.native
  
  var params: UnknownObject = js.native
  
  def persist(): js.Promise[String] = js.native
  
  var prompt: PromptDetail = js.native
  
  var result: js.UndefOr[InteractionResults] = js.native
  
  var returnTo: String = js.native
  
  var session: js.UndefOr[Cookie] = js.native
  
  var trusted: js.UndefOr[js.Array[String]] = js.native
  
  var uid: String = js.native
}

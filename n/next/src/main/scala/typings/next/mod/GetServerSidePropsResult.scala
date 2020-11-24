package typings.next.mod

import typings.next.nextBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.next.anon.PropsP[P]
  - typings.next.anon.RedirectRedirect
  - typings.next.anon.NotFound
*/
trait GetServerSidePropsResult[P] extends js.Object
object GetServerSidePropsResult {
  
  @scala.inline
  def PropsP[P](props: P): GetServerSidePropsResult[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsResult[P]]
  }
  
  @scala.inline
  def RedirectRedirect[P](redirect: Redirect): GetServerSidePropsResult[P] = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsResult[P]]
  }
  
  @scala.inline
  def NotFound[P](notFound: `true`): GetServerSidePropsResult[P] = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsResult[P]]
  }
}

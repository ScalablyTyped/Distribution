package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPromise extends js.Object {
  
  def `catch`(errorCallback: js.Function0[Unit]): DefaultPromise = js.native
  
  def `then`(
    successCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
    errorCallback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): DefaultPromise = js.native
}
object DefaultPromise {
  
  @scala.inline
  def apply(
    `catch`: js.Function0[Unit] => DefaultPromise,
    `then`: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
  ): DefaultPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[DefaultPromise]
  }
  
  @scala.inline
  implicit class DefaultPromiseOps[Self <: DefaultPromise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatch(value: js.Function0[Unit] => DefaultPromise): Self = this.set("catch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThen(
      value: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
    ): Self = this.set("then", js.Any.fromFunction2(value))
  }
}

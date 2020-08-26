package typings.mdxJsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedMDXProviderProps extends js.Object {
  var components: MDXProviderComponents = js.native
}

object InjectedMDXProviderProps {
  @scala.inline
  def apply(components: MDXProviderComponents): InjectedMDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedMDXProviderProps]
  }
  @scala.inline
  implicit class InjectedMDXProviderPropsOps[Self <: InjectedMDXProviderProps] (val x: Self) extends AnyVal {
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
    def setComponents(value: MDXProviderComponents): Self = this.set("components", value.asInstanceOf[js.Any])
  }
  
}


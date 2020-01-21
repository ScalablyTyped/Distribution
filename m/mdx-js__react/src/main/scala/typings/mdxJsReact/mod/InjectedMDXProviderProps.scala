package typings.mdxJsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedMDXProviderProps extends js.Object {
  var components: MDXProviderComponents
}

object InjectedMDXProviderProps {
  @scala.inline
  def apply(components: MDXProviderComponents): InjectedMDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectedMDXProviderProps]
  }
}


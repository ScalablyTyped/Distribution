package typings.mdxJsReact.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDXProviderProps extends js.Object {
  var children: ReactNode
  var components: MDXProviderComponentsProp
}

object MDXProviderProps {
  @scala.inline
  def apply(components: MDXProviderComponentsProp, children: ReactNode = null): MDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDXProviderProps]
  }
}


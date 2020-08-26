package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {[name: string] : any} */
@js.native
trait AppInitialPropsnamestring
  extends /* k */ StringDictionary[js.Any] {
  var pageProps: js.Any = js.native
}

object AppInitialPropsnamestring {
  @scala.inline
  def apply(pageProps: js.Any): AppInitialPropsnamestring = {
    val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInitialPropsnamestring]
  }
  @scala.inline
  implicit class AppInitialPropsnamestringOps[Self <: AppInitialPropsnamestring] (val x: Self) extends AnyVal {
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
    def setPageProps(value: js.Any): Self = this.set("pageProps", value.asInstanceOf[js.Any])
  }
  
}


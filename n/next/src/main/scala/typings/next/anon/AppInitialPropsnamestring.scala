package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {[name: string] : any} */
trait AppInitialPropsnamestring
  extends /* k */ StringDictionary[js.Any] {
  var pageProps: js.Any
}

object AppInitialPropsnamestring {
  @scala.inline
  def apply(pageProps: js.Any, StringDictionary: /* name */ StringDictionary[js.Any] = null): AppInitialPropsnamestring = {
    val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AppInitialPropsnamestring]
  }
}


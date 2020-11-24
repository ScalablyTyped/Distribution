package typings.metascraperLogoFavicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PickDefaultFunction = js.Function1[
    /* sizes */ js.Array[typings.metascraperLogoFavicon.mod.FaviconSize], 
    typings.metascraperLogoFavicon.mod.FaviconSize
  ]
  
  type PickFunction = js.Function2[
    /* sizes */ js.Array[typings.metascraperLogoFavicon.mod.FaviconSize], 
    /* pickDefault */ typings.metascraperLogoFavicon.mod.PickDefaultFunction, 
    typings.metascraperLogoFavicon.mod.FaviconSize
  ]
}

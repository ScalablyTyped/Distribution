package typings.ndnDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faceMod {
  import typings.ndnDashJs.interestMod.Interest
  import typings.ndnDashJs.nameMod.Name

  type OnInterestCallback = js.Function5[
    /* prefix */ Name, 
    /* interest */ Interest, 
    /* face */ Face, 
    /* filterId */ Double, 
    /* filter */ InterestFilter, 
    js.Any
  ]
}

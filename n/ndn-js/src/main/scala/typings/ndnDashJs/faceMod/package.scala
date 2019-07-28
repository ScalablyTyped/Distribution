package typings.ndnDashJs

import typings.ndnDashJs.interestMod.Interest
import typings.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faceMod {
  type OnInterestCallback = js.Function5[
    /* prefix */ Name, 
    /* interest */ Interest, 
    /* face */ Face, 
    /* filterId */ Double, 
    /* filter */ InterestFilter, 
    js.Any
  ]
}

package typings
package ndnDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faceMod {
  type OnInterestCallback = js.Function5[
    /* prefix */ ndnDashJsLib.nameMod.Name, 
    /* interest */ ndnDashJsLib.interestMod.Interest, 
    /* face */ Face, 
    /* filterId */ scala.Double, 
    /* filter */ InterestFilter, 
    js.Any
  ]
}

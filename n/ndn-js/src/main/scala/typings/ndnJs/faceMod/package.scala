package typings.ndnJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object faceMod {
  
  type OnInterestCallback = js.Function5[
    /* prefix */ typings.ndnJs.nameMod.Name, 
    /* interest */ typings.ndnJs.interestMod.Interest, 
    /* face */ typings.ndnJs.faceMod.Face, 
    /* filterId */ scala.Double, 
    /* filter */ typings.ndnJs.faceMod.InterestFilter, 
    js.Any
  ]
}

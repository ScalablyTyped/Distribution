package typings.node

import typings.node.NodeJSNs.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object netMod {
  type LookupFunction = js.Function3[
    /* hostname */ java.lang.String, 
    /* options */ LookupOneOptions, 
    /* callback */ js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ], 
    Unit
  ]
}

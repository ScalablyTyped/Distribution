package typings.node.querystringMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The querystring.decode() function is an alias for querystring.parse().
  */
@JSImport("querystring", "decode")
@js.native
object decode
  extends TopLevel[
      js.Function4[
        /* str */ java.lang.String, 
        /* sep */ js.UndefOr[java.lang.String], 
        /* eq */ js.UndefOr[java.lang.String], 
        /* options */ js.UndefOr[ParseOptions], 
        ParsedUrlQuery
      ]
    ]


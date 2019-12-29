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
        /* str */ String, 
        /* sep */ js.UndefOr[String], 
        /* eq */ js.UndefOr[String], 
        /* options */ js.UndefOr[ParseOptions], 
        ParsedUrlQuery
      ]
    ]


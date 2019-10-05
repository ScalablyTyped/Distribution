package typings.node.querystringMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The querystring.encode() function is an alias for querystring.stringify().
  */
@JSImport("querystring", "encode")
@js.native
object encode
  extends TopLevel[
      js.Function4[
        /* obj */ js.UndefOr[ParsedUrlQueryInput], 
        /* sep */ js.UndefOr[java.lang.String], 
        /* eq */ js.UndefOr[java.lang.String], 
        /* options */ js.UndefOr[StringifyOptions], 
        java.lang.String
      ]
    ]


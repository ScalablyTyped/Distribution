package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * htmlparser2 tree adapter Element interface.
     */

trait Element extends ParentNode {
  /**
           * Element attributes.
           */
  var attribs: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
           * The name of the node. Equals to element {@link tagName}.
           */
  var name: java.lang.String
  /**
           * Element namespace.
           */
  var namespace: java.lang.String
  /**
           * Element source code location info. Available if location info is enabled via ParserOptions.
           */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.ElementLocation] = js.undefined
  /**
           * Element tag name.
           */
  var tagName: java.lang.String
  /**
           * Element attribute namespaces.
           */
  var `x-attribsNamespace`: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
           * Element attribute namespace-related prefixes.
           */
  var `x-attribsPrefix`: ScalablyTyped.runtime.StringDictionary[java.lang.String]
}


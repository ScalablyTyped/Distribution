package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibMergeRulesMod {
  
  inline def apply(
    rule: Rule_,
    properties: js.Array[String],
    callback: js.Function3[
      /* rules */ js.Array[Declaration], 
      /* last */ Declaration, 
      /* props */ js.Array[Declaration], 
      Boolean
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(rule.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("postcss-merge-longhand/types/lib/mergeRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

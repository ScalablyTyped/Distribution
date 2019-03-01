package typings
package morganLib.morganMod.morganNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenIndexer
  extends /* tokenName */ org.scalablytyped.runtime.StringDictionary[TokenCallbackFn]

object TokenIndexer {
  @scala.inline
  def apply(
    StringDictionary: /* tokenName */ org.scalablytyped.runtime.StringDictionary[TokenCallbackFn] = null
  ): TokenIndexer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TokenIndexer]
  }
}


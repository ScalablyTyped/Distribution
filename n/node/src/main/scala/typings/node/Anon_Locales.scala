package typings.node

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntlNs.PluralRules
import typings.std.IntlNs.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Locales
  extends Instantiable0[PluralRules]
     with Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ PluralRulesOptions, 
      PluralRules
    ]
     with Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      PluralRules
    ] {
  def apply(): PluralRules = js.native
  def apply(locales: java.lang.String): PluralRules = js.native
  def apply(locales: java.lang.String, options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: js.Array[java.lang.String]): PluralRules = js.native
  def apply(locales: js.Array[java.lang.String], options: PluralRulesOptions): PluralRules = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: PluralRulesOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: PluralRulesOptions): js.Array[java.lang.String] = js.native
}


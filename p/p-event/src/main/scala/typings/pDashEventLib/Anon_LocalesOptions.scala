package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalesOptions
  extends org.scalablytyped.runtime.Instantiable0[pDashEventLib.IntlNs.Collator]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ pDashEventLib.IntlNs.CollatorOptions, 
      pDashEventLib.IntlNs.Collator
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      pDashEventLib.IntlNs.Collator
    ] {
  def apply(): pDashEventLib.IntlNs.Collator = js.native
  def apply(locales: java.lang.String): pDashEventLib.IntlNs.Collator = js.native
  def apply(locales: java.lang.String, options: pDashEventLib.IntlNs.CollatorOptions): pDashEventLib.IntlNs.Collator = js.native
  def apply(locales: Array[java.lang.String]): pDashEventLib.IntlNs.Collator = js.native
  def apply(locales: Array[java.lang.String], options: pDashEventLib.IntlNs.CollatorOptions): pDashEventLib.IntlNs.Collator = js.native
  def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: pDashEventLib.IntlNs.CollatorOptions): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String], options: pDashEventLib.IntlNs.CollatorOptions): Array[java.lang.String] = js.native
}


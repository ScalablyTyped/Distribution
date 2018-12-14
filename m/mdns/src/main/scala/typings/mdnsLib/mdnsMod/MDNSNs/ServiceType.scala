package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceType
  extends org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      /* protocol */ java.lang.String, 
      /* subtypes (repeated) */ java.lang.String, 
      ServiceType
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* serviceTypeIdentifier */ java.lang.String) | (/* serviceTypeIdentifier */ js.Array[java.lang.String]) | (/* serviceTypeIdentifier */ mdnsLib.Anon_Name) | (/* serviceType */ ServiceType), 
      ServiceType
    ] {
  var fullyQualified: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var subtypes: js.Array[java.lang.String] = js.native
  def fromArray(serviceTypeIdentifier: js.Array[java.lang.String]): ServiceType = js.native
  def fromJSON(serviceTypeIdentifier: mdnsLib.Anon_Name): ServiceType = js.native
  def fromJSON(serviceType: ServiceType): ServiceType = js.native
  def fromString(serviceTypeIdentifier: java.lang.String): ServiceType = js.native
  def toArray(): js.Array[java.lang.String] = js.native
}


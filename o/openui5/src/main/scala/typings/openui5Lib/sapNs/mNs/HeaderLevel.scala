package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderLevel extends js.Object

/**
     * Different levels for headers
    */
@JSGlobal("sap.m.HeaderLevel")
@js.native
object HeaderLevel extends js.Object {
  @js.native
  sealed trait H1
    extends openui5Lib.sapNs.mNs.HeaderLevel
  
  @js.native
  sealed trait H2
    extends openui5Lib.sapNs.mNs.HeaderLevel
  
  @js.native
  sealed trait H3
    extends openui5Lib.sapNs.mNs.HeaderLevel
  
  @js.native
  sealed trait H4
    extends openui5Lib.sapNs.mNs.HeaderLevel
  
  @js.native
  sealed trait H5
    extends openui5Lib.sapNs.mNs.HeaderLevel
  
  @js.native
  sealed trait H6
    extends openui5Lib.sapNs.mNs.HeaderLevel
  
  val H1: H1 with java.lang.String = js.native
  val H2: H2 with java.lang.String = js.native
  val H3: H3 with java.lang.String = js.native
  val H4: H4 with java.lang.String = js.native
  val H5: H5 with java.lang.String = js.native
  val H6: H6 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.HeaderLevel with java.lang.String] = js.native
}


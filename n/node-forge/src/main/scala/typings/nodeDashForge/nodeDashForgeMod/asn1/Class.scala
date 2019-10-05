package typings.nodeDashForge.nodeDashForgeMod.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Class extends js.Object

@JSImport("node-forge", "asn1.Class")
@js.native
object Class extends js.Object {
  @js.native
  sealed trait APPLICATION extends Class
  
  @js.native
  sealed trait CONTEXT_SPECIFIC extends Class
  
  @js.native
  sealed trait PRIVATE extends Class
  
  @js.native
  sealed trait UNIVERSAL extends Class
  
  /* 0x40 */ val APPLICATION: typings.nodeDashForge.nodeDashForgeMod.asn1.Class.APPLICATION with Double = js.native
  /* 0x80 */ val CONTEXT_SPECIFIC: typings.nodeDashForge.nodeDashForgeMod.asn1.Class.CONTEXT_SPECIFIC with Double = js.native
  /* 0xC0 */ val PRIVATE: typings.nodeDashForge.nodeDashForgeMod.asn1.Class.PRIVATE with Double = js.native
  /* 0x00 */ val UNIVERSAL: typings.nodeDashForge.nodeDashForgeMod.asn1.Class.UNIVERSAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Class with Double] = js.native
}


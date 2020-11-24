package typings.overwatchApi

import typings.overwatchApi.mod.PLATFORM
import typings.overwatchApi.mod.REGION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overwatchApiStrings {
  
  @scala.inline
  def cn: cn = "cn".asInstanceOf[cn]
  
  @scala.inline
  def eu: eu = "eu".asInstanceOf[eu]
  
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @scala.inline
  def kr: kr = "kr".asInstanceOf[kr]
  
  @scala.inline
  def pc: pc = "pc".asInstanceOf[pc]
  
  @scala.inline
  def psn: psn = "psn".asInstanceOf[psn]
  
  @scala.inline
  def us: us = "us".asInstanceOf[us]
  
  @scala.inline
  def xbl: xbl = "xbl".asInstanceOf[xbl]
  
  @js.native
  sealed trait cn extends REGION
  
  @js.native
  sealed trait eu extends REGION
  
  @js.native
  sealed trait global extends REGION
  
  @js.native
  sealed trait kr extends REGION
  
  @js.native
  sealed trait pc extends PLATFORM
  
  @js.native
  sealed trait psn extends PLATFORM
  
  @js.native
  sealed trait us extends REGION
  
  @js.native
  sealed trait xbl extends PLATFORM
}

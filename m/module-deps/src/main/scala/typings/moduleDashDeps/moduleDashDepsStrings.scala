package typings.moduleDashDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object moduleDashDepsStrings {
  @js.native
  sealed trait PACKAGE extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait transform extends js.Object
  
  @scala.inline
  def PACKAGE: PACKAGE = "package".asInstanceOf[PACKAGE]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
}


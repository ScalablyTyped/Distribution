package typings.multer

import typings.multer.mod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object multerStrings {
  @js.native
  sealed trait LIMIT_FIELD_COUNT extends ErrorCode
  
  @js.native
  sealed trait LIMIT_FIELD_KEY extends ErrorCode
  
  @js.native
  sealed trait LIMIT_FIELD_VALUE extends ErrorCode
  
  @js.native
  sealed trait LIMIT_FILE_COUNT extends ErrorCode
  
  @js.native
  sealed trait LIMIT_FILE_SIZE extends ErrorCode
  
  @js.native
  sealed trait LIMIT_PART_COUNT extends ErrorCode
  
  @js.native
  sealed trait LIMIT_UNEXPECTED_FILE extends ErrorCode
  
  @scala.inline
  def LIMIT_FIELD_COUNT: LIMIT_FIELD_COUNT = "LIMIT_FIELD_COUNT".asInstanceOf[LIMIT_FIELD_COUNT]
  @scala.inline
  def LIMIT_FIELD_KEY: LIMIT_FIELD_KEY = "LIMIT_FIELD_KEY".asInstanceOf[LIMIT_FIELD_KEY]
  @scala.inline
  def LIMIT_FIELD_VALUE: LIMIT_FIELD_VALUE = "LIMIT_FIELD_VALUE".asInstanceOf[LIMIT_FIELD_VALUE]
  @scala.inline
  def LIMIT_FILE_COUNT: LIMIT_FILE_COUNT = "LIMIT_FILE_COUNT".asInstanceOf[LIMIT_FILE_COUNT]
  @scala.inline
  def LIMIT_FILE_SIZE: LIMIT_FILE_SIZE = "LIMIT_FILE_SIZE".asInstanceOf[LIMIT_FILE_SIZE]
  @scala.inline
  def LIMIT_PART_COUNT: LIMIT_PART_COUNT = "LIMIT_PART_COUNT".asInstanceOf[LIMIT_PART_COUNT]
  @scala.inline
  def LIMIT_UNEXPECTED_FILE: LIMIT_UNEXPECTED_FILE = "LIMIT_UNEXPECTED_FILE".asInstanceOf[LIMIT_UNEXPECTED_FILE]
}


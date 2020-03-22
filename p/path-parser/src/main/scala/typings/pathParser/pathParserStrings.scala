package typings.pathParser

import typings.pathParser.encodingMod.URLParamsEncodingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pathParserStrings {
  @js.native
  sealed trait default extends URLParamsEncodingType
  
  @js.native
  sealed trait legacy extends URLParamsEncodingType
  
  @js.native
  sealed trait none extends URLParamsEncodingType
  
  @js.native
  sealed trait uri extends URLParamsEncodingType
  
  @js.native
  sealed trait uriComponent extends URLParamsEncodingType
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def legacy: legacy = "legacy".asInstanceOf[legacy]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def uri: uri = "uri".asInstanceOf[uri]
  @scala.inline
  def uriComponent: uriComponent = "uriComponent".asInstanceOf[uriComponent]
}


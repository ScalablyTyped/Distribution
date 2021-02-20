package typings.pathParser

import typings.pathParser.encodingMod.URLParamsEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathParserStrings {
  
  @js.native
  sealed trait default extends URLParamsEncodingType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait legacy extends URLParamsEncodingType
  @scala.inline
  def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait none extends URLParamsEncodingType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait uri extends URLParamsEncodingType
  @scala.inline
  def uri: uri = "uri".asInstanceOf[uri]
  
  @js.native
  sealed trait uriComponent extends URLParamsEncodingType
  @scala.inline
  def uriComponent: uriComponent = "uriComponent".asInstanceOf[uriComponent]
}

package typings.micromarkUtilTypes

import typings.micromarkUtilTypes.mod.ContentType
import typings.micromarkUtilTypes.mod.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object micromarkUtilTypesStrings {
  
  @js.native
  sealed trait Carriagereturn extends StObject
  inline def Carriagereturn: Carriagereturn = "\r".asInstanceOf[Carriagereturn]
  
  @js.native
  sealed trait CarriagereturnLinefeed extends StObject
  inline def CarriagereturnLinefeed: CarriagereturnLinefeed = "\r\n".asInstanceOf[CarriagereturnLinefeed]
  
  @js.native
  sealed trait Linefeed extends StObject
  inline def Linefeed: Linefeed = "\n".asInstanceOf[Linefeed]
  
  @js.native
  sealed trait after extends StObject
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait ascii
    extends StObject
       with Encoding
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64
    extends StObject
       with Encoding
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait before extends StObject
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait binary
    extends StObject
       with Encoding
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait content
    extends StObject
       with ContentType
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait document
    extends StObject
       with ContentType
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait enter extends StObject
  inline def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait exit extends StObject
  inline def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait flow
    extends StObject
       with ContentType
  inline def flow: flow = "flow".asInstanceOf[flow]
  
  @js.native
  sealed trait hex
    extends StObject
       with Encoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait latin1
    extends StObject
       with Encoding
  inline def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @js.native
  sealed trait string
    extends StObject
       with ContentType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait text
    extends StObject
       with ContentType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `ucs-2`
    extends StObject
       with Encoding
  inline def `ucs-2`: `ucs-2` = "ucs-2".asInstanceOf[`ucs-2`]
  
  @js.native
  sealed trait ucs2
    extends StObject
       with Encoding
  inline def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @js.native
  sealed trait `utf-8`
    extends StObject
       with Encoding
  inline def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  
  @js.native
  sealed trait utf16le
    extends StObject
       with Encoding
  inline def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8
    extends StObject
       with Encoding
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

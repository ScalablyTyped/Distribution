package typings.pg

import typings.pg.typeOverridesMod.TypeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgStrings {
  
  @js.native
  sealed trait acquire extends StObject
  inline def acquire: acquire = "acquire".asInstanceOf[acquire]
  
  @js.native
  sealed trait array extends StObject
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait binary
    extends StObject
       with TypeFormat
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait drain extends StObject
  inline def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait notice extends StObject
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait notification extends StObject
  inline def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait row extends StObject
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait text
    extends StObject
       with TypeFormat
  inline def text: text = "text".asInstanceOf[text]
}

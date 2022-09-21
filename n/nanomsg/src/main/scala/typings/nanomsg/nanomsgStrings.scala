package typings.nanomsg

import typings.nanomsg.mod.SocketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nanomsgStrings {
  
  @js.native
  sealed trait binary extends StObject
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait bus
    extends StObject
       with SocketType
  inline def bus: bus = "bus".asInstanceOf[bus]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait pair
    extends StObject
       with SocketType
  inline def pair: pair = "pair".asInstanceOf[pair]
  
  @js.native
  sealed trait pub
    extends StObject
       with SocketType
  inline def pub: pub = "pub".asInstanceOf[pub]
  
  @js.native
  sealed trait pull
    extends StObject
       with SocketType
  inline def pull: pull = "pull".asInstanceOf[pull]
  
  @js.native
  sealed trait push
    extends StObject
       with SocketType
  inline def push: push = "push".asInstanceOf[push]
  
  @js.native
  sealed trait rep
    extends StObject
       with SocketType
  inline def rep: rep = "rep".asInstanceOf[rep]
  
  @js.native
  sealed trait req
    extends StObject
       with SocketType
  inline def req: req = "req".asInstanceOf[req]
  
  @js.native
  sealed trait respondent
    extends StObject
       with SocketType
  inline def respondent: respondent = "respondent".asInstanceOf[respondent]
  
  @js.native
  sealed trait sub
    extends StObject
       with SocketType
  inline def sub: sub = "sub".asInstanceOf[sub]
  
  @js.native
  sealed trait surveyor
    extends StObject
       with SocketType
  inline def surveyor: surveyor = "surveyor".asInstanceOf[surveyor]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
}

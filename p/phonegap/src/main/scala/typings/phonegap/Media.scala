package typings.phonegap

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.MediaError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
interface InAppBrowser {
  addEventListener(eventname: string, callback): void;
  removeEventListener(eventname: string, callback): void;
  open(url?: string, target?: string, features?: string, replace?: boolean): Window;
  close(): void;
}
*/
@js.native
trait Media
  extends Instantiable2[/* src */ String, /* mediaSuccess */ js.Function, Media]
     with Instantiable3[
      /* src */ String, 
      /* mediaSuccess */ js.Function, 
      /* mediaError */ js.Function1[/* mediaError */ MediaError, js.Any], 
      Media
    ]
     with Instantiable4[
      /* src */ String, 
      /* mediaSuccess */ js.Function, 
      js.UndefOr[/* mediaError */ js.Function1[/* mediaError */ MediaError, js.Any]], 
      /* mediaStatus */ js.Function, 
      Media
    ] {
  
  def getCurrentPosition(mediaSuccess: js.Function): Unit = js.native
  def getCurrentPosition(mediaSuccess: js.Function, mediaError: js.Function1[/* mediaError */ MediaError, _]): Unit = js.native
  
  def getDuration(): js.Any = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def release(): Unit = js.native
  
  def seekTo(milliseconds: Double): Unit = js.native
  
  def startRecord(): Unit = js.native
  
  def stop(): Unit = js.native
  
  def stopRecord(): Unit = js.native
}

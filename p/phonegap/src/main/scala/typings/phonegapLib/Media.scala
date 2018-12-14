package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends org.scalablytyped.runtime.Instantiable2[/* src */ java.lang.String, /* mediaSuccess */ js.Function, Media]
     with org.scalablytyped.runtime.Instantiable3[
      /* src */ java.lang.String, 
      /* mediaSuccess */ js.Function, 
      /* mediaError */ js.Function1[/* mediaError */ stdLib.MediaError, js.Any], 
      Media
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* src */ java.lang.String, 
      /* mediaSuccess */ js.Function, 
      /* mediaError */ js.Function1[/* mediaError */ stdLib.MediaError, js.Any], 
      /* mediaStatus */ js.Function, 
      Media
    ] {
  def getCurrentPosition(mediaSuccess: js.Function): scala.Unit = js.native
  def getCurrentPosition(mediaSuccess: js.Function, mediaError: js.Function1[/* mediaError */ stdLib.MediaError, _]): scala.Unit = js.native
  def getDuration(): js.Any = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def release(): scala.Unit = js.native
  def seekTo(milliseconds: scala.Double): scala.Unit = js.native
  def startRecord(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stopRecord(): scala.Unit = js.native
}

@JSGlobal("Media")
@js.native
object Media
  extends org.scalablytyped.runtime.Instantiable3[
      /* src */ java.lang.String, 
      /* onSuccess */ js.Function1[/* arg */ js.Any, js.Any], 
      /* onError */ js.Function1[/* error */ js.Any, js.Any], 
      Media
    ]


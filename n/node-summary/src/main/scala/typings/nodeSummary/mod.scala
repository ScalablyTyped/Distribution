package typings.nodeSummary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-summary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSortedSentences(
    content: String,
    n: Double,
    callback: js.Function3[
      /* err */ js.Error, 
      /* sortedSentences */ js.Array[String], 
      /* dict */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedSentences")(content.asInstanceOf[js.Any], n.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getSortedSentences(
    content: String,
    n: Double,
    callback: js.Function3[
      /* err */ js.Error, 
      /* sortedSentences */ js.Array[String], 
      /* dict */ js.UndefOr[js.Object], 
      Unit
    ],
    sentences_dict: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedSentences")(content.asInstanceOf[js.Any], n.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], sentences_dict.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def summarize(
    title: String,
    content: String,
    callback: js.Function3[/* err */ js.Error, /* summary */ String, /* dict */ js.UndefOr[js.Object], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("summarize")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def summarizeFromUrl(url: String, callback: js.Function2[/* err */ js.Error, /* summary */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("summarizeFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

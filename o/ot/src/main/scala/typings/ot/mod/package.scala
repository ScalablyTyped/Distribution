package typings.ot.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ot.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type Clients[T] = StringDictionary[T]

type SerializedTextOperation = js.Array[String | Double]

package typings.popperjsCore.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.anon.PartialSideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Obj = StringDictionary[Any]

type Padding = Double | PartialSideObject

type SetAction[S] = S | (js.Function1[/* prev */ S, S])

type UpdateCallback = js.Function1[/* arg0 */ State, Unit]

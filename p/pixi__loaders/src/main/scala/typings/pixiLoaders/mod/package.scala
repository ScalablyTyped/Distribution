package typings.pixiLoaders.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ILoaderMiddleware = js.Function2[
/* resource */ LoaderResource, 
/* next */ js.Function1[/* repeated */ Any, Unit], 
Unit]

type ILoaderResource = LoaderResource

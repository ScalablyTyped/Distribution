package typings.pluginError.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.pluginError.anon.Optionsmessagestring
import typings.pluginError.anon.Optionspluginstringmessag
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor
  extends /**
  * @param options Options with plugin name and message
  */
Instantiable1[/* options */ Optionspluginstringmessag, typings.pluginError.anon.PluginError]
     with /**
  * @param plugin Plugin name
  * @param error Base error
  * @param options Error options
  */
/**
  * @param plugin Plugin name
  * @param error Base error, error message, or options with message
  */
Instantiable2[
      /* plugin */ String, 
      (/* error */ Error) | (/* error */ Optionsmessagestring) | (/* error */ String), 
      PluginError[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof std.Error ]: undefined}
  */ typings.pluginError.pluginErrorStrings.Constructor with TopLevel[js.Any]) | Error
      ]
    ]
     with /**
  * @param plugin Plugin name
  * @param error Base error or error message
  * @param options Error options
  */
Instantiable3[
      /* plugin */ String, 
      (/* error */ Error) | (/* error */ String), 
      /* options */ Options, 
      PluginError[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof std.Error ]: undefined}
  */ typings.pluginError.pluginErrorStrings.Constructor with TopLevel[js.Any]) | Error
      ]
    ]

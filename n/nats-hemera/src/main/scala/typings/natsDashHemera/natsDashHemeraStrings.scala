package typings.natsDashHemera

import typings.natsDashHemera.natsDashHemeraMod.ExtensionType
import typings.natsDashHemera.natsDashHemeraMod.GuidVersions
import typings.natsDashHemera.natsDashHemeraMod.HemeraEvents
import typings.natsDashHemera.natsDashHemeraMod.LogLevel
import typings.natsDashHemera.natsDashHemeraMod.RequestType
import typings.natsDashHemera.natsDashHemeraMod.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object natsDashHemeraStrings {
  @js.native
  sealed trait NFC extends js.Object
  
  @js.native
  sealed trait NFD extends js.Object
  
  @js.native
  sealed trait NFKC extends js.Object
  
  @js.native
  sealed trait NFKD extends js.Object
  
  @js.native
  sealed trait Rules extends js.Object
  
  @js.native
  sealed trait alternatives extends Types
  
  @js.native
  sealed trait any extends Types
  
  @js.native
  sealed trait array extends Types
  
  @js.native
  sealed trait binary extends Types
  
  @js.native
  sealed trait boolean extends Types
  
  @js.native
  sealed trait clientPostRequest extends HemeraEvents
  
  @js.native
  sealed trait clientPreRequest extends HemeraEvents
  
  @js.native
  sealed trait date extends Types
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait depth extends js.Object
  
  @js.native
  sealed trait error
    extends HemeraEvents
       with LogLevel
  
  @js.native
  sealed trait fatal extends LogLevel
  
  @js.native
  sealed trait forbidden extends js.Object
  
  @js.native
  sealed trait function extends Types
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait insertion extends js.Object
  
  @js.native
  sealed trait javascript extends js.Object
  
  @js.native
  sealed trait `lazy` extends Types
  
  @js.native
  sealed trait number extends Types
  
  @js.native
  sealed trait `object` extends Types
  
  @js.native
  sealed trait onClientPostRequest extends ExtensionType
  
  @js.native
  sealed trait onClientPreRequest extends ExtensionType
  
  @js.native
  sealed trait onServerPreHandler extends ExtensionType
  
  @js.native
  sealed trait onServerPreRequest extends ExtensionType
  
  @js.native
  sealed trait onServerPreResponse extends ExtensionType
  
  @js.native
  sealed trait optional extends js.Object
  
  @js.native
  sealed trait pubsub extends RequestType
  
  @js.native
  sealed trait request extends RequestType
  
  @js.native
  sealed trait required extends js.Object
  
  @js.native
  sealed trait serverPreHandler extends HemeraEvents
  
  @js.native
  sealed trait serverPreRequest extends HemeraEvents
  
  @js.native
  sealed trait serverPreResponse extends HemeraEvents
  
  @js.native
  sealed trait silent extends LogLevel
  
  @js.native
  sealed trait string extends Types
  
  @js.native
  sealed trait trace extends LogLevel
  
  @js.native
  sealed trait unix extends js.Object
  
  @js.native
  sealed trait uuidv1 extends GuidVersions
  
  @js.native
  sealed trait uuidv2 extends GuidVersions
  
  @js.native
  sealed trait uuidv3 extends GuidVersions
  
  @js.native
  sealed trait uuidv4 extends GuidVersions
  
  @js.native
  sealed trait uuidv5 extends GuidVersions
  
  @js.native
  sealed trait warn extends LogLevel
  
  @scala.inline
  def NFC: NFC = "NFC".asInstanceOf[NFC]
  @scala.inline
  def NFD: NFD = "NFD".asInstanceOf[NFD]
  @scala.inline
  def NFKC: NFKC = "NFKC".asInstanceOf[NFKC]
  @scala.inline
  def NFKD: NFKD = "NFKD".asInstanceOf[NFKD]
  @scala.inline
  def Rules: Rules = "Rules".asInstanceOf[Rules]
  @scala.inline
  def alternatives: alternatives = "alternatives".asInstanceOf[alternatives]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def clientPostRequest: clientPostRequest = "clientPostRequest".asInstanceOf[clientPostRequest]
  @scala.inline
  def clientPreRequest: clientPreRequest = "clientPreRequest".asInstanceOf[clientPreRequest]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def depth: depth = "depth".asInstanceOf[depth]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def forbidden: forbidden = "forbidden".asInstanceOf[forbidden]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def insertion: insertion = "insertion".asInstanceOf[insertion]
  @scala.inline
  def javascript: javascript = "javascript".asInstanceOf[javascript]
  @scala.inline
  def `lazy`: `lazy` = "lazy".asInstanceOf[`lazy`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def onClientPostRequest: onClientPostRequest = "onClientPostRequest".asInstanceOf[onClientPostRequest]
  @scala.inline
  def onClientPreRequest: onClientPreRequest = "onClientPreRequest".asInstanceOf[onClientPreRequest]
  @scala.inline
  def onServerPreHandler: onServerPreHandler = "onServerPreHandler".asInstanceOf[onServerPreHandler]
  @scala.inline
  def onServerPreRequest: onServerPreRequest = "onServerPreRequest".asInstanceOf[onServerPreRequest]
  @scala.inline
  def onServerPreResponse: onServerPreResponse = "onServerPreResponse".asInstanceOf[onServerPreResponse]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def pubsub: pubsub = "pubsub".asInstanceOf[pubsub]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def serverPreHandler: serverPreHandler = "serverPreHandler".asInstanceOf[serverPreHandler]
  @scala.inline
  def serverPreRequest: serverPreRequest = "serverPreRequest".asInstanceOf[serverPreRequest]
  @scala.inline
  def serverPreResponse: serverPreResponse = "serverPreResponse".asInstanceOf[serverPreResponse]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def unix: unix = "unix".asInstanceOf[unix]
  @scala.inline
  def uuidv1: uuidv1 = "uuidv1".asInstanceOf[uuidv1]
  @scala.inline
  def uuidv2: uuidv2 = "uuidv2".asInstanceOf[uuidv2]
  @scala.inline
  def uuidv3: uuidv3 = "uuidv3".asInstanceOf[uuidv3]
  @scala.inline
  def uuidv4: uuidv4 = "uuidv4".asInstanceOf[uuidv4]
  @scala.inline
  def uuidv5: uuidv5 = "uuidv5".asInstanceOf[uuidv5]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}


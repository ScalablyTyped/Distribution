package typings
package nextLib.nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextNs {
  /**
    * Next.js counterpart of React.ComponentClass.
    *
    * @template P Component props.
    * @template IP Initial props returned from getInitialProps.
    * @template C Context passed to getInitialProps.
    */
  type NextComponentClass[P, IP, C] = (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) with (NextStaticLifecycle[IP, C])
  /**
    * Next.js counterpart of React.ComponentType.
    * Specially useful in HOCs that receive Next.js components.
    *
    * @template P Component props.
    * @template IP Initial props returned from getInitialProps.
    * @template C Context passed to getInitialProps.
    */
  type NextComponentType[P, IP, C] = (NextComponentClass[P, IP, C]) | (NextStatelessComponent[P, IP, C])
  // Moved to next-server
  type NextConfig = nextDashServerLib.nextDashConfigMod.NextConfig
  type NextFC[P, IP, C] = NextFunctionComponent[P, IP, C]
  /**
    * Next.js counterpart of React.FC/React.FunctionComponent.
    *
    * @template P Component props.
    * @template IP Initial props returned from getInitialProps.
    * @template C Context passed to getInitialProps.
    */
  type NextFunctionComponent[P, IP, C] = reactLib.reactMod.ReactNs.FunctionComponent[P] with (NextStaticLifecycle[IP, C])
  /**
    * @deprecated as of recent React versions, function components can no
    * longer be considered 'stateless'. Please use `NextFunctionComponent` instead.
    *
    * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
    */
  type NextSFC[P, IP, C] = NextFunctionComponent[P, IP, C]
  /**
    * @deprecated as of recent React versions, function components can no
    * longer be considered 'stateless'. Please use `NextFunctionComponent` instead.
    *
    * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
    */
  type NextStatelessComponent[P, IP, C] = NextFunctionComponent[P, IP, C]
  // End Moved to next-server
  // Deprecated
  type QueryStringMapObject = nextDashServerLib.routerMod.DefaultQuery
  type Server = nextDashServerLib.nextDashServerMod.nextNs.Server
  type ServerConfig = NextConfig
  type ServerOptions = nextDashServerLib.nextDashServerMod.nextNs.ServerOptions
}

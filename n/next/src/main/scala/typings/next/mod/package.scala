package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typings.next.mod.GetServerSidePropsContext[Q], 
    js.Promise[typings.next.mod.GetServerSidePropsResult[P]]
  ]
  
  type GetStaticPaths[P /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typings.next.mod.GetStaticPathsContext, 
    js.Promise[typings.next.mod.GetStaticPathsResult[P]]
  ]
  
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typings.next.mod.GetStaticPropsContext[Q], 
    js.Promise[typings.next.mod.GetStaticPropsResult[P]]
  ]
  
  type InferGetServerSidePropsType[T] = js.Any
  
  type InferGetStaticPropsType[T] = js.Any
  
  type NextPage[P, IP] = typings.next.libUtilsMod.NextComponentType[typings.next.libUtilsMod.NextPageContext, IP, P]
}
